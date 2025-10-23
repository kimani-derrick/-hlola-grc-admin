package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* renamed from: q  reason: collision with root package name */
    public final String f5249q;

    /* renamed from: r  reason: collision with root package name */
    public final CharSequence f5250r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f5251s;

    /* renamed from: t  reason: collision with root package name */
    public final CharSequence f5252t;

    /* renamed from: u  reason: collision with root package name */
    public final Bitmap f5253u;

    /* renamed from: v  reason: collision with root package name */
    public final Uri f5254v;

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f5255w;

    /* renamed from: x  reason: collision with root package name */
    public final Uri f5256x;

    /* renamed from: y  reason: collision with root package name */
    public MediaDescription f5257y;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f5249q = str;
        this.f5250r = charSequence;
        this.f5251s = charSequence2;
        this.f5252t = charSequence3;
        this.f5253u = bitmap;
        this.f5254v = uri;
        this.f5255w = bundle;
        this.f5256x = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f5250r) + ", " + ((Object) this.f5251s) + ", " + ((Object) this.f5252t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        MediaDescription mediaDescription = this.f5257y;
        if (mediaDescription == null) {
            MediaDescription.Builder b7 = b.b();
            b.n(b7, this.f5249q);
            b.p(b7, this.f5250r);
            b.o(b7, this.f5251s);
            b.j(b7, this.f5252t);
            b.l(b7, this.f5253u);
            b.m(b7, this.f5254v);
            b.k(b7, this.f5255w);
            c.b(b7, this.f5256x);
            mediaDescription = b.a(b7);
            this.f5257y = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i7);
    }
}
