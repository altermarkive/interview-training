#!/usr/bin/env python3
# https://www.hackerrank.com/challenges/py-hello-world

from .helper import io_checker

import unittest


def main():
    print('Hello, World!')

if __name__ == '__main__':
    main()


class TestCode(unittest.TestCase):
    def test_0(self):
        io_checker(self, __file__, '0', main)
