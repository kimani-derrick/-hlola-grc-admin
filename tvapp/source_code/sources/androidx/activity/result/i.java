package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new android.support.v4.media.a(5);

    /* renamed from: q  reason: collision with root package name */
    public final IntentSender f5370q;

    /* renamed from: r  reason: collision with root package name */
    public final Intent f5371r;

    /* renamed from: s  reason: collision with root package name */
    public final int f5372s;

    /* renamed from: t  reason: collision with root package name */
    public final int f5373t;

    public i(IntentSender intentSender, Intent intent, int i7, int i8) {
        M5.g.f(intentSender, "intentSender");
        this.f5370q = intentSender;
        this.f5371r = intent;
        this.f5372s = i7;
        this.f5373t = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        M5.g.f(parcel, "dest");
        parcel.writeParcelable(this.f5370q, i7);
        parcel.writeParcelable(this.f5371r, i7);
        parcel.writeInt(this.f5372s);
        parcel.writeInt(this.f5373t);
    }
}
