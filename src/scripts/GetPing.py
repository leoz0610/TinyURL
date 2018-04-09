#!/usr/bin/python

import http.client

class HttpClient:
    def __init__(self, host, port=None):
        self.host = host
        self.port = port
        self.conn = http.client.HTTPConnection(self.host, self.port)


    def sendRequest(self, method, url, body=None):
        self.conn.request(method, url, body)
        return self.conn.getresponse()


if __name__ == '__main__':
    cliObj = HttpClient('localhost', 8080)
    resp = cliObj.sendRequest("GET", "/ping")
    print(resp.status)
    print(resp.read())