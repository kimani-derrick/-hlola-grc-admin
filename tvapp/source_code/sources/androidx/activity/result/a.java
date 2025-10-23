package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(4);

    /* renamed from: q  reason: collision with root package name */
    public final int f5356q;

    /* renamed from: r  reason: collision with root package name */
    public final Intent f5357r;

    public a(Intent intent, int i7) {
        this.f5356q = i7;
        this.f5357r = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f5356q;
        if (i7 != -1) {
            if (i7 != 0) {
                str = String.valueOf(i7);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f5357r);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f5356q);
        Intent intent = this.f5357r;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }

    public a(Parcel parcel) {
        this.f5356q = parcel.readInt();
        this.f5357r = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
