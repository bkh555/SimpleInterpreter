# Test1.R

# This program tests basic statements and expressions. 

source ("List.R")

main <- function () {
  x <- as.integer (readline ());
  y <- as.integer (readline ());
  q <- 0;
  r <- x;
  while (r >= y) {
    q <- q + 1;
    r <- r - y;
  }
  print (q);
  print (r);
}
