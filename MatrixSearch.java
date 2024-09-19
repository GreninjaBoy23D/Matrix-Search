import java.util.Arrays;
import java.util.*;
public class MatrixSearch
{
    int MatrixSearch(int arr[], int key, int key2, int key3)
    {
    while (key <= key2)
        {
            int mid = (key + key2) / 2;
            if(arr[mid] == key3)
            {
                return mid;
            }
            else if (arr[mid] > key3)
            {
                key2 = mid - 1;
            }
            else
            {
            key = mid + 1;
            }
        }
    return -1;    
    }
}