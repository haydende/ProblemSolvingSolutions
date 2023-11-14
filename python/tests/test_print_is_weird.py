
import unittest

from python.src.print_is_weird import print_is_weird
from python.tests.Capturing import Capturing


class TestPrintIsWeird(unittest.TestCase):

    def test_24_NotWeird(self):
        with Capturing() as output:
            print_is_weird(24)

        self.assertEqual("Not Weird", output[0])

    def test_2_NotWeird(self):
        with Capturing() as output:
            print_is_weird(2)

        self.assertEqual("Not Weird", output[0])

    def test_8_Weird(self):
        with Capturing() as output:
            print_is_weird(2)

        self.assertEqual("Not Weird", output[0])

    def test_21_NotWeird(self):
        with Capturing() as output:
            print_is_weird(21)

        self.assertEqual("Weird", output[0])

    def test_1_Weird(self):
        with Capturing() as output:
            print_is_weird(1)

        self.assertEqual("Weird", output[0])

    def test_4_NotWeird(self):
        with Capturing() as output:
            print_is_weird(4)

        self.assertEqual("Not Weird", output[0])



