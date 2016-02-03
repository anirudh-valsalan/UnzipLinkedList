Rearrange elements of a singly linked list by chaining together elements that are k apart.

-- The class contains a test method which will.
   1)Add elements into a linked list.
   2)Promts the user to enter the value for interval.
   This linked list will be used for testing the functonality.
   
-- unzipLink -Method which will unzip the input linked list according to the interval specified in the input.
   input parameters :node - which will be the singly linked list object.
                    :interval - chaining interval.
   return parameter :node - which contain the chained node which are k apart.
   

-- getFirstNode - Method to generate the single linked list for testing functonality.

-- printNodes - Method to print the nodes.


Sample input and output
============================================================
Input length 10 and interval 2
============================================================  

Before unzip
10	11	12	13	14	15	16	17	18	19	
Enter the interval
2
After unzip
10	12	14	16	18	11	13	15	17	19	

============================================================
Input length 10 and interval 4
============================================================  

Before unzip
10	11	12	13	14	15	16	17	18	19	
Enter the interval
4
After unzip
10	14	18	11	15	19	12	16	13	17	
============================================================
Input length 10 and interval 10
============================================================  
Before unzip
10	11	12	13	14	15	16	17	18	19	
Enter the interval
10
After unzip
10	11	12	13	14	15	16	17	18	19	
