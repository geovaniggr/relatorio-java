#!/bin/bash

# for i in { 1..50}; do java Sincronismo; done
for((i=1;i<=500;i+=1)); do java SynchronizedIncrement; done

#total count = 400000 vs. expected = 400000
# Achei o 3
#total count = 400000 vs. expected = 400000
# Achei o 3
# Achei o 3