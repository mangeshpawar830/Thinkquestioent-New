package com.khadijaMam;

public class Job {
    private int jobId;
    private String profile;
    private JoiningDate joiningDate;

    public Job(int jobId, String profile, JoiningDate joiningDate) {
        this.jobId = jobId;
        this.profile = profile;
        this.joiningDate = joiningDate;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public JoiningDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(JoiningDate joiningDate) {
        this.joiningDate = joiningDate;
    }
}

