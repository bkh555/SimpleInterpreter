# Test5.R

# This program tests recursive functions on lists.

source ("List.R")

cons_my_list <- function (r, my_list) {
  if (r <= 10) {
    my_list <- cons (r, my_list);
    my_list <- cons_my_list (r + 1, my_list);
  }
  return (my_list);
}

main <- function () {
# r <- as.integer (readline ());
# my_list <- null ();
# my_list <- cons_my_list (r, my_list);
# print (my_list);
  print (cons_my_list (as.integer (readline ()), null ())); # nested function calls
}
