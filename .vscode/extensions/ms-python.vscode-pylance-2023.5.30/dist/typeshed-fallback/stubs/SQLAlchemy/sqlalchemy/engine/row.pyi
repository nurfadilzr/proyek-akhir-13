from abc import ABCMeta
from collections.abc import ItemsView, Iterator, KeysView, Mapping, Sequence, ValuesView
from typing import Any, Generic, TypeVar

from ..cresultproxy import BaseRow as BaseRow

_VT_co = TypeVar("_VT_co", covariant=True)

MD_INDEX: int

def rowproxy_reconstructor(cls, state): ...

KEY_INTEGER_ONLY: int
KEY_OBJECTS_ONLY: int
KEY_OBJECTS_BUT_WARN: int
KEY_OBJECTS_NO_WARN: int

class Row(BaseRow, Sequence[Any], metaclass=ABCMeta):
    # The count and index methods are inherited from Sequence.
    # If the result set contains columns with the same names, these
    # fields contains their respective values, instead. We don't reflect
    # this in the stubs.
    __hash__ = BaseRow.__hash__  # type: ignore[assignment]
    def __lt__(self, other: Row | tuple[Any, ...]) -> bool: ...
    def __le__(self, other: Row | tuple[Any, ...]) -> bool: ...
    def __ge__(self, other: Row | tuple[Any, ...]) -> bool: ...
    def __gt__(self, other: Row | tuple[Any, ...]) -> bool: ...
    def __eq__(self, other: object) -> bool: ...
    def __ne__(self, other: object) -> bool: ...
    def keys(self) -> list[str]: ...
    def __contains__(self, key): ...
    # The following methods are public, but have a leading underscore
    # to prevent conflicts with column names.
    @property
    def _mapping(self) -> RowMapping: ...
    @property
    def _fields(self) -> tuple[str, ...]: ...
    def _asdict(self) -> dict[str, Any]: ...

class LegacyRow(Row, metaclass=ABCMeta):
    def has_key(self, key: str) -> bool: ...
    def items(self) -> list[tuple[str, Any]]: ...
    def iterkeys(self) -> Iterator[str]: ...
    def itervalues(self) -> Iterator[Any]: ...
    def values(self) -> list[Any]: ...

BaseRowProxy = BaseRow
RowProxy = Row

class ROMappingView(KeysView[str], ValuesView[_VT_co], ItemsView[str, _VT_co], Generic[_VT_co]):  # type: ignore[misc]
    def __init__(self, mapping: RowMapping, items: list[_VT_co]) -> None: ...
    def __len__(self) -> int: ...
    def __iter__(self) -> Iterator[_VT_co]: ...  # type: ignore[override]
    def __eq__(self, other: ROMappingView[_VT_co]) -> bool: ...  # type: ignore[override]
    def __ne__(self, other: ROMappingView[_VT_co]) -> bool: ...  # type: ignore[override]

class RowMapping(BaseRow, Mapping[str, Row]):
    __getitem__: Any
    def __iter__(self) -> Iterator[str]: ...
    def __len__(self) -> int: ...
    def items(self) -> ROMappingView[tuple[str, Any]]: ...  # type: ignore[override]
    def keys(self) -> list[str]: ...  # type: ignore[override]
    def values(self) -> ROMappingView[Any]: ...  # type: ignore[override]
