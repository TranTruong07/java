// Java implementation of the approach
import java.util.*;

class GFG{

static int size = 8;
static int disk_size = 200;

// Function to perform C-LOOK on the request
// array starting from the given head
public static void CLOOK(int arr[], int head)
{
	int seek_count = 0;
	int distance, cur_track;
	
	Vector<Integer> left = new Vector<Integer>();
	Vector<Integer> right = new Vector<Integer>();
	Vector<Integer> seek_sequence = new Vector<Integer>();

	// Tracks on the left of the
	// head will be serviced when
	// once the head comes back
	// to the beginning (left end)
	for(int i = 0; i < size; i++)
	{
		if (arr[i] < head)
			left.add(arr[i]);
		if (arr[i] > head)
			right.add(arr[i]);
	}

	// Sorting left and right vectors
	Collections.sort(left);
	Collections.sort(right);

	// First service the requests
	// on the right side of the
	// head
	for(int i = 0; i < right.size(); i++)
	{
		cur_track = right.get(i);

		// Appending current track
		// to seek sequence
		seek_sequence.add(cur_track);

		// Calculate absolute distance
		distance = Math.abs(cur_track - head);

		// Increase the total count
		seek_count += distance;

		// Accessed track is now new head
		head = cur_track;
	}

	// Once reached the right end
	// jump to the last track that
	// is needed to be serviced in
	// left direction
	seek_count += Math.abs(head - left.get(0));
	head = left.get(0);

	// Now service the requests again
	// which are left
	for(int i = 0; i < left.size(); i++)
	{
		cur_track = left.get(i);

		// Appending current track to
		// seek sequence
		seek_sequence.add(cur_track);

		// Calculate absolute distance
		distance = Math.abs(cur_track - head);

		// Increase the total count
		seek_count += distance;

		// Accessed track is now the new head
		head = cur_track;
	}
	
	System.out.println("Total number of seek " +
					"operations = " + seek_count);

	System.out.println("Seek Sequence is");

	for(int i = 0; i < seek_sequence.size(); i++)
	{
		System.out.println(seek_sequence.get(i));
	}
}

// Driver code
public static void main(String []args)
{
	
	// Request array
	int arr[] = { 98, 137, 122, 183, 14, 133, 65, 78};
        //98, 137, 122, 183, 14, 133, 65, 78
	int head = 54;
        //54

	System.out.println("Initial position of head: " +
					head);

	CLOOK(arr, head);
}
}
//Total number of seek operations = 321
//Total number of seek operations = 298
// This code is contributed by divyesh072019
