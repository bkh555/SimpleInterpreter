# Test4.R

# This program tests recursive functions.

source ("List.R")

facto <- function (x) {
  if (x == 1) {
    s <- 1;
  }
  else {
    s <- x * facto (x - 1);
  }
  return (s);
}

main <- function () {
  i <- as.integer (readline ());
  fac <- facto (i);
  print (fac);
}
