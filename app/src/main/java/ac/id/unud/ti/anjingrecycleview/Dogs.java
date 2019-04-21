package ac.id.unud.ti.anjingrecycleview;

import android.os.Parcel;
import android.os.Parcelable;

public class Dogs implements Parcelable {
    private String name, remarks, photo, desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
    }

    public Dogs() {
    }
    protected Dogs(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<Dogs> CREATOR = new Parcelable.Creator<Dogs>() {
        @Override
        public Dogs createFromParcel(Parcel source) {
            return new Dogs(source);
        }
        @Override
        public Dogs[] newArray(int size) {
            return new Dogs[size];
        }
    };
}
