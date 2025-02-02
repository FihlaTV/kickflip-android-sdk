package io.kickflip.sdk.api.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Map;

/**
 * Kickflip base Stream response
 */
public class Stream extends Response implements Comparable<Stream>, Serializable {

    @SerializedName("stream_id")
    private String mStreamId;

    @SerializedName("stream_type")
    private String mStreamType;

    @SerializedName("chat_url")
    private String mChatUrl;

    @SerializedName("upload_url")
    private String mUploadUrl;

    @SerializedName("stream_url")
    private String mStreamUrl;

    @SerializedName("kickflip_url")
    private String mKickflipUrl;

    @SerializedName("lat")
    private double mLatitude;

    @SerializedName("lon")
    private double mLongitude;

    @SerializedName("city")
    private String mCity;

    @SerializedName("state")
    private String mState;

    @SerializedName("country")
    private String mCountry;

    @SerializedName("private")
    private boolean mPrivate;

    @SerializedName("title")
    private String mTitle;

    @SerializedName("description")
    private String mDescription;

    @SerializedName("extra_info")
    private String mExtraInfo;

    @SerializedName("thumbnail_url")
    private String mThumbnailUrl;

    @SerializedName("time_started")
    private String mTimeStarted;

    @SerializedName("length")
    private int mLength;

    @SerializedName("user_username")
    private String mOwnerName;

    @SerializedName("user_avatar")
    private String mOwnerAvatar;

    @SerializedName("deleted")
    private boolean mDeleted;

    public boolean isDeleted() {
        return mDeleted;
    }

    public void setDeleted(boolean deleted) {
        mDeleted = deleted;
    }

    public String getOwnerName() {
        return mOwnerName;
    }

    public String getOwnerAvatar() {
        return mOwnerAvatar;
    }

    public String getThumbnailUrl() {
        return mThumbnailUrl;
    }

    public void setThumbnailUrl(String url) {
        mThumbnailUrl = url;
    }

    public String getStreamId() {
        return mStreamId;
    }

    public String getStreamType() {
        return mStreamType;
    }

    public String getChatUrl() {
        return mChatUrl;
    }

    public String getUploadUrl() {
        return mUploadUrl;
    }

    public String getStreamUrl() {
        return mStreamUrl;
    }

    public String getKickflipUrl() {
        return mKickflipUrl;
    }

    public String getTimeStarted() {
        return mTimeStarted;
    }

    public int getLengthInSeconds() {
        return mLength;
    }

    public Map getExtraInfo() {
        if (mExtraInfo != null && !mExtraInfo.equals("")) {
            return new Gson().fromJson(mExtraInfo, Map.class);
        }
        return null;
    }

    public String getExtraInfoString() {
        return mExtraInfo;
    }

    public void setExtraInfo(Map mExtraInfo) {
        this.mExtraInfo = new Gson().toJson(mExtraInfo);
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double mLongitude) {
        this.mLongitude = mLongitude;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String mCity) {
        this.mCity = mCity;
    }

    public String getState() {
        return mState;
    }

    public void setState(String mState) {
        this.mState = mState;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public boolean isPrivate() {
        return mPrivate;
    }

    public void setIsPrivate(boolean mPrivate) {
        this.mPrivate = mPrivate;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    @Override
    public int compareTo(Stream another) {
        return another.getTimeStarted().compareTo(getTimeStarted());
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null) return false;

        if (obj instanceof Stream) {
            Stream other = (Stream) obj;
            return Objects.equal(mStreamId, other.getStreamId());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mStreamId);
    }

}
