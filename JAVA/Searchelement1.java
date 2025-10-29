class Searchelement1
{
    public static void main(String [] args){
       int arr[]={20,56,7,8,2};
       int length=arr.length;
       int i;
       int flag=0;
       int key=12;
       
       for(i=0;i<length;i++)
       {
        if(arr[i]==key)
        {
            flag=1;
            break;
        }
        
       }
       if(flag==1)
        {
            System.out.println("elements found");
        }
    
else
{
    System.out.println("elements not found");
}
    }
}