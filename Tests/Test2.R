# Test2.R

# This program tests list manipulation operators.

source ("List.R")

main <- function () {
  r <- 2;
  my_list <- null ();
  while (r < 5) {
    my_list <- cons (r, my_list);
    r <- r + 1;
  }
  h <- head (my_list);
  my_list_tl <- tail (my_list);
  print (h);
  print (my_list_tl);
}
