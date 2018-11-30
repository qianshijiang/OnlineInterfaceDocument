package com.cn.interfacedocument.entity;

public class AdjustBookWithBLOBs extends AdjustBook {
    private String problem;

    private String solve;

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }

    public String getSolve() {
        return solve;
    }

    public void setSolve(String solve) {
        this.solve = solve == null ? null : solve.trim();
    }
}