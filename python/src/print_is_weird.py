#!/bin/python3

import math
import os
import random
import re
import sys


def print_is_weird(n):
    """
    https://www.hackerrank.com/challenges/py-if-else/problem
    """
    is_even = n % 2 == 0
    if is_even is False:
        print("Weird")
    else:
        if (1 < n < 6) or (n > 20):
            print("Not Weird")
        else:
            print("Weird")
