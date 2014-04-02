package com.linkedin.drelephant.analysis.heuristics;

import com.linkedin.drelephant.hadoop.HadoopCounterHolder;
import com.linkedin.drelephant.hadoop.HadoopJobData;
import com.linkedin.drelephant.hadoop.HadoopTaskData;

public class ReducerDataSkewHeuristic extends GenericDataSkewHeuristic {
    private static final String heuristicName = "Reducer Data Skew";

    public ReducerDataSkewHeuristic() {
        super(HadoopCounterHolder.CounterName.REDUCE_SHUFFLE_BYTES, heuristicName);
    }

    @Override
    protected HadoopTaskData[] getTasks(HadoopJobData data) {
        return data.getReducerData();
    }
}