package com.google.android.gms.common.api;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g3.n;
import h3.AbstractC0748a;
/* loaded from: classes.dex */
public final class Scope extends AbstractC0748a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a(18);

    /* renamed from: q  reason: collision with root package name */
    public final int f8219q;

    /* renamed from: r  reason: collision with root package name */
    public final String f8220r;

    public Scope(String str, int i7) {
        n.d(str, "scopeUri must not be null or empty");
        this.f8219q = i7;
        this.f8220r = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f8220r.equals(((Scope) obj).f8220r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8220r.hashCode();
    }

    public final String toString() {
        return this.f8220r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.R(parcel, 1, 4);
        parcel.writeInt(this.f8219q);
        AbstractC0189a.M(parcel, 2, this.f8220r);
        AbstractC0189a.Q(parcel, P6);
    }
}
