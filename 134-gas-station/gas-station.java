class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tGas=0, tCost=0;

        for(int val: gas) tGas+= val;
        for(int val: cost) tCost+= val;

        if(tGas<tCost) return -1;

        int s=0, cg=0;

        for(int i=0; i<gas.length; i++) {
            cg+= (gas[i] - cost[i]);

            if(cg<0) {
                s=i+1;
                cg=0;
            }
        }

        return s;
    }
}