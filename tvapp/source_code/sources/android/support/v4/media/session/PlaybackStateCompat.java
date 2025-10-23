package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import r0.AbstractC1111a;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* renamed from: A  reason: collision with root package name */
    public final Bundle f5272A;

    /* renamed from: q  reason: collision with root package name */
    public final int f5273q;

    /* renamed from: r  reason: collision with root package name */
    public final long f5274r;

    /* renamed from: s  reason: collision with root package name */
    public final long f5275s;

    /* renamed from: t  reason: collision with root package name */
    public final float f5276t;

    /* renamed from: u  reason: collision with root package name */
    public final long f5277u;

    /* renamed from: v  reason: collision with root package name */
    public final int f5278v;

    /* renamed from: w  reason: collision with root package name */
    public final CharSequence f5279w;

    /* renamed from: x  reason: collision with root package name */
    public final long f5280x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f5281y;

    /* renamed from: z  reason: collision with root package name */
    public final long f5282z;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: q  reason: collision with root package name */
        public final String f5283q;

        /* renamed from: r  reason: collision with root package name */
        public final CharSequence f5284r;

        /* renamed from: s  reason: collision with root package name */
        public final int f5285s;

        /* renamed from: t  reason: collision with root package name */
        public final Bundle f5286t;

        public CustomAction(Parcel parcel) {
            this.f5283q = parcel.readString();
            this.f5284r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5285s = parcel.readInt();
            this.f5286t = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f5284r) + ", mIcon=" + this.f5285s + ", mExtras=" + this.f5286t;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f5283q);
            TextUtils.writeToParcel(this.f5284r, parcel, i7);
            parcel.writeInt(this.f5285s);
            parcel.writeBundle(this.f5286t);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f5273q = parcel.readInt();
        this.f5274r = parcel.readLong();
        this.f5276t = parcel.readFloat();
        this.f5280x = parcel.readLong();
        this.f5275s = parcel.readLong();
        this.f5277u = parcel.readLong();
        this.f5279w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5281y = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f5282z = parcel.readLong();
        this.f5272A = parcel.readBundle(b.class.getClassLoader());
        this.f5278v = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f5273q);
        sb.append(", position=");
        sb.append(this.f5274r);
        sb.append(", buffered position=");
        sb.append(this.f5275s);
        sb.append(", speed=");
        sb.append(this.f5276t);
        sb.append(", updated=");
        sb.append(this.f5280x);
        sb.append(", actions=");
        sb.append(this.f5277u);
        sb.append(", error code=");
        sb.append(this.f5278v);
        sb.append(", error message=");
        sb.append(this.f5279w);
        sb.append(", custom actions=");
        sb.append(this.f5281y);
        sb.append(", active item id=");
        return AbstractC1111a.s(sb, this.f5282z, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f5273q);
        parcel.writeLong(this.f5274r);
        parcel.writeFloat(this.f5276t);
        parcel.writeLong(this.f5280x);
        parcel.writeLong(this.f5275s);
        parcel.writeLong(this.f5277u);
        TextUtils.writeToParcel(this.f5279w, parcel, i7);
        parcel.writeTypedList(this.f5281y);
        parcel.writeLong(this.f5282z);
        parcel.writeBundle(this.f5272A);
        parcel.writeInt(this.f5278v);
    }
}
