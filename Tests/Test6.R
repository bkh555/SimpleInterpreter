# Test6.R

# This program tests two recursive functions on lists.

source ("List.R")

cons_a_list <- function (r, list) {
  my_list <- list;
  if (r != 0) {
    my_list <- cons_a_list (r - 1, cons (r, list));
  }
  return (my_list);
}

equal <- function (list1, list2) {
  if (length (list1) != length (list2)) {
    result <- 0;
  }
  else {
    if (length (list1) == 0 && length (list2) == 0) {
      result <- 1;
    }
    else {
      if (head (list1) != head (list2)) {
        result <- 0;
      }
      else {
        result <- equal (tail (list1), tail (list2));
      }
    }
  }
  return (result);
}

main <- function () {
  r <- as.integer (readline ());
  my_list <- null ();
  l1 <- cons_a_list (r, my_list);
  l2 <- cons_a_list (r, my_list);  
  l3 <- cons_a_list (r - 1, my_list);  
  l1_eq_l2 <- equal (l1, l2);
  l1_eq_l3 <- equal (l1, l3);
  print (l1_eq_l2);
  print (l1_eq_l3);
}
