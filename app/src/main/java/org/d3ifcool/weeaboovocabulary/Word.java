package org.d3ifcool.weeaboovocabulary;

/**
 * Created by andinu on 13/03/2018.
 */

public class Word {
    private String mTimeSchedule;
    private int mImageSchedule, mImageTimeline;
    private String mDate, mFirstVocab, mSecondVocab, mThirdVocab, mFourthVocab, mFifthVocab;

    public Word(String timeSchedule, int imageSchedule) {
        this.mTimeSchedule = timeSchedule;
        this.mImageSchedule = imageSchedule;
    }

    public Word(int mImageTimeline, String mDate, String mFirstVocab, String mSecondVocab, String mThirdVocab, String mFourthVocab, String mFifthVocab) {
        this.mImageTimeline = mImageTimeline;
        this.mDate = mDate;
        this.mFirstVocab = mFirstVocab;
        this.mSecondVocab = mSecondVocab;
        this.mThirdVocab = mThirdVocab;
        this.mFourthVocab = mFourthVocab;
        this.mFifthVocab = mFifthVocab;
    }

    public Word(int mImageTimeline, String mDate) {
        this.mImageTimeline = mImageTimeline;
        this.mDate = mDate;
    }

    public Word(String mFirstVocab, String mSecondVocab, String mThirdVocab, String mFourthVocab, String mFifthVocab) {
        this.mFirstVocab = mFirstVocab;
        this.mSecondVocab = mSecondVocab;
        this.mThirdVocab = mThirdVocab;
        this.mFourthVocab = mFourthVocab;
        this.mFifthVocab = mFifthVocab;
    }

    public String getTimeSchedule() {
        return mTimeSchedule;
    }

    public int getImageSchedule() {
        return mImageSchedule;
    }

    public int getmImageTimeline() {
        return mImageTimeline;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmFirstVocab() {
        return mFirstVocab;
    }

    public String getmSecondVocab() {
        return mSecondVocab;
    }

    public String getmThirdVocab() {
        return mThirdVocab;
    }

    public String getmFourthVocab() {
        return mFourthVocab;
    }

    public String getmFifthVocab() {
        return mFifthVocab;
    }
}
