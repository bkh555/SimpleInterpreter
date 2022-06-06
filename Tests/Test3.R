# Test3.R

# This program tests non-recursive functions.

source ("List.R")

area <- function (x, y, h) {
  z <- 2 * (x * y + (x * h) + y * h);
  return (z);
}

main <- function () {
  a <- as.integer (readline ());
  b <- as.integer (readline ());
  h <- as.integer (readline ());
  s <- area (a, b, h);
  print (s);
}
