int majorityElement(int* nums, int numsSize) {
    int major=nums[0];
    int occ=1;
    for(int i=1;i<numsSize;i++)
    {
        if(major!=nums[i]){
               occ--;
        }
        else{
            occ++;
        }
        if(occ==0)
        {
            major=nums[i];
            occ=1;
        }
    }
    return major;
}