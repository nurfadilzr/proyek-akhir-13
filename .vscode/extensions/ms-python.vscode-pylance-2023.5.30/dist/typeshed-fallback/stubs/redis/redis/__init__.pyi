from . import client, connection, credentials, exceptions, sentinel, utils
from .cluster import RedisCluster as RedisCluster

__all__ = [
    "AuthenticationError",
    "AuthenticationWrongNumberOfArgsError",
    "BlockingConnectionPool",
    "BusyLoadingError",
    "ChildDeadlockedError",
    "Connection",
    "ConnectionError",
    "ConnectionPool",
    "CredentialProvider",
    "DataError",
    "from_url",
    "InvalidResponse",
    "PubSubError",
    "ReadOnlyError",
    "Redis",
    "RedisCluster",
    "RedisError",
    "ResponseError",
    "Sentinel",
    "SentinelConnectionPool",
    "SentinelManagedConnection",
    "SentinelManagedSSLConnection",
    "SSLConnection",
    "UsernamePasswordCredentialProvider",
    "StrictRedis",
    "TimeoutError",
    "UnixDomainSocketConnection",
    "WatchError",
]

Redis = client.Redis

BlockingConnectionPool = connection.BlockingConnectionPool
Connection = connection.Connection
ConnectionPool = connection.ConnectionPool
SSLConnection = connection.SSLConnection
StrictRedis = client.StrictRedis
UnixDomainSocketConnection = connection.UnixDomainSocketConnection

from_url = utils.from_url

Sentinel = sentinel.Sentinel
SentinelConnectionPool = sentinel.SentinelConnectionPool
SentinelManagedConnection = sentinel.SentinelManagedConnection
SentinelManagedSSLConnection = sentinel.SentinelManagedSSLConnection

AuthenticationError = exceptions.AuthenticationError
AuthenticationWrongNumberOfArgsError = exceptions.AuthenticationWrongNumberOfArgsError
BusyLoadingError = exceptions.BusyLoadingError
ChildDeadlockedError = exceptions.ChildDeadlockedError
ConnectionError = exceptions.ConnectionError
DataError = exceptions.DataError
InvalidResponse = exceptions.InvalidResponse
PubSubError = exceptions.PubSubError
ReadOnlyError = exceptions.ReadOnlyError
RedisError = exceptions.RedisError
ResponseError = exceptions.ResponseError
TimeoutError = exceptions.TimeoutError
WatchError = exceptions.WatchError

CredentialProvider = credentials.CredentialProvider
UsernamePasswordCredentialProvider = credentials.UsernamePasswordCredentialProvider

__version__: str
VERSION: tuple[int | str, ...]
