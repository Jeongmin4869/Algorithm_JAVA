class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int N = energy.length;
        int times = 0;
        for(int i=0; i<N; i++){            
            if(initialExperience <= experience[i]){
                int need = experience[i] - initialExperience + 1;
                times += need; 
                initialExperience += need;
            }
            if(initialEnergy <= energy[i]){
                int need = energy[i] - initialEnergy + 1;
                times += need;
                initialEnergy += need;
            }
            initialEnergy -= energy[i];
            initialExperience += experience[i];
        }
        return times ;
    }
}
