# -*- coding: utf-8 -*-
"""
Created on Sun May 10 23:02:58 2020

@author: buse
"""


n = int(input().strip())
if (1 <= n <= 100):
    if (n % 2 != 0):
        print('Weird')
    if (n % 2 == 0 and (5 >= n > 2)):
        print('Not Weird')
    if (n % 2 == 0 and (20 >= n > 6)):
        print('Weird')
    if (n % 2 == 0 and n > 20):
        print('Not Weird')
