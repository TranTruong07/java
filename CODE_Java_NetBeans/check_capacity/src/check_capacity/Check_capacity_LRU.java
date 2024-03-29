//// Java implementation of above algorithm
// 
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
// 
//class Test
//{
//    // Method to find page faults using indexes
//    static int pageFaults(int pages[], int n, int capacity)
//    {
//        // To represent set of current pages. We use
//        // an unordered_set so that we quickly check
//        // if a page is present in set or not
//        HashSet<Integer> s = new HashSet<>(capacity);
//      
//        // To store least recently used indexes
//        // of pages.
//        HashMap<Integer, Integer> indexes = new HashMap<>();
//      
//        // Start from initial page
//        int page_faults = 0;
//        for (int i=0; i<n; i++)
//        {
//            // Check if the set can hold more pages
//            if (s.size() < capacity)
//            {
//                // Insert it into set if not present
//                // already which represents page fault
//                if (!s.contains(pages[i]))
//                {
//                    s.add(pages[i]);
//      
//                    // increment page fault
//                    page_faults++;
//                }
//      
//                // Store the recently used index of
//                // each page
//                indexes.put(pages[i], i);
//            }
//      
//            // If the set is full then need to perform lru
//            // i.e. remove the least recently used page
//            // and insert the current page
//            else
//            {
//                // Check if current page is not already
//                // present in the set
//                if (!s.contains(pages[i]))
//                {
//                    // Find the least recently used pages
//                    // that is present in the set
//                    int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE;
//                     
//                    Iterator<Integer> itr = s.iterator();
//                     
//                    while (itr.hasNext()) {
//                        int temp = itr.next();
//                        if (indexes.get(temp) < lru)
//                        {
//                            lru = indexes.get(temp);
//                            val = temp;
//                        }
//                    }
//                 
//                    // Remove the indexes page
//                    s.remove(val);
//                   //remove lru from hashmap
//                   indexes.remove(val);
//                    // insert the current page
//                    s.add(pages[i]);
//      
//                    // Increment page faults
//                    page_faults++;
//                }
//      
//                // Update the current page index
//                indexes.put(pages[i], i);
//            }
//        }
//      
//        return page_faults;
//    }
//     
//    // Driver method
//    public static void main(String args[])
//    {
//        int pages[] = {3, 8, 2, 3, 9, 1, 6, 3, 8, 9, 3, 6, 2, 1, 3};
//        
//        int capacity = 5; // OUTPUT: 9
////        capacity là một tham số đại diện cho dung lượng bộ nhớ đệm (cache) trong thuật toán thay thế trang LRU (Least Recently Used). 
////        Nó chỉ ra số lượng trang tối đa mà bộ nhớ đệm có thể chứa.
////        Trong trường hợp này, giá trị capacity = 4 cho biết rằng bộ nhớ đệm có thể chứa tối đa 4 trang.
//         
//        System.out.println(pageFaults(pages, pages.length, capacity));
//    }
//}
//// This code is contributed by Gaurav Miglani