from typing import Any, ClassVar
from typing_extensions import Literal

from ._imaging import _PixelAccessor
from .ImageFile import ImageFile

COMPRESSION: Any
PAD: Any

def i(c): ...
def dump(c) -> None: ...

class IptcImageFile(ImageFile):
    format: ClassVar[Literal["IPTC"]]
    format_description: ClassVar[str]
    def getint(self, key): ...
    def field(self): ...
    im: Any
    def load(self) -> _PixelAccessor: ...

def getiptcinfo(im): ...
