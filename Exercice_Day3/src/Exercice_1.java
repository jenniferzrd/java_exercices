
public class Exercice_1 {

	public static void main(String[] args) {

        int myArray[] = {0, 1, 2, 3, 4, 5};
        int[] result = reverse(myArray);

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        int myArray2[] = {0, 1, 2, 2, 3, 4, 3, 5, 3};
        int[] result2 = isdouble(myArray2);

        commun(myArray, myArray2);

    }

    

    public static int[] reverse(int array[]) {
        for(int min = 0, max = (array.length - 1); min < max; min++, max--) {

            int hold = array[min];
            array[min] = array[max];
            array[max] = hold;

        }

        return array;

    }

    

    public static int[] isdouble(int array[]) {

        for(int i = 0; i < array.length; i++) {

            for(int j = i+1; j < array.length; j++) {

                if(array[i] == array[j]) {
                    System.out.println(""+array[i]+" en positions "+i+" et "+j);
                }

            }

        }

        return array;

    }

    

    public static void commun(int array1[], int array2[]) {

        for(int i = 0; i < array1.length; i++) {

            for(int j = 0; j < array2.length; j++) {

                if(array1[i] == array2[j]) {

                    System.out.println(""+array1[i]+" en commun");

                }

            }

        }

    }

}


//METHODE 2
//void inverseTableau(long tableau[], long tailleTableau)
//{
//       long i = 0, temp = 0;
//       for (i = 0 ; i < tailleTableau / 2 ; i++)
//       {
//               temp = tableau[i];
//               tableau[i] = tableau[tailleTableau - i - 1];
//               tableau[tailleTableau - i - 1] = temp;
//       }
//}
