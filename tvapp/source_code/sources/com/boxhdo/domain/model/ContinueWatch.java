package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class ContinueWatch implements Parcelable {
    public static final Parcelable.Creator<ContinueWatch> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final Long f7947A;

    /* renamed from: B  reason: collision with root package name */
    public final Integer f7948B;

    /* renamed from: C  reason: collision with root package name */
    public final long f7949C;

    /* renamed from: q  reason: collision with root package name */
    public final long f7950q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7951r;

    /* renamed from: s  reason: collision with root package name */
    public final String f7952s;

    /* renamed from: t  reason: collision with root package name */
    public final String f7953t;

    /* renamed from: u  reason: collision with root package name */
    public final String f7954u;

    /* renamed from: v  reason: collision with root package name */
    public final float f7955v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7956w;

    /* renamed from: x  reason: collision with root package name */
    public final Long f7957x;

    /* renamed from: y  reason: collision with root package name */
    public final Long f7958y;

    /* renamed from: z  reason: collision with root package name */
    public final Long f7959z;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ContinueWatch> {
        @Override // android.os.Parcelable.Creator
        public final ContinueWatch createFromParcel(Parcel parcel) {
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            Long valueOf4;
            g.f(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            float readFloat = parcel.readFloat();
            String readString5 = parcel.readString();
            Integer num = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new ContinueWatch(readLong, readString, readString2, readString3, readString4, readFloat, readString5, valueOf, valueOf2, valueOf3, valueOf4, num, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ContinueWatch[] newArray(int i7) {
            return new ContinueWatch[i7];
        }
    }

    public ContinueWatch(long j7, String str, String str2, String str3, String str4, float f, String str5, Long l7, Long l8, Long l9, Long l10, Integer num, long j8) {
        g.f(str, "movieName");
        this.f7950q = j7;
        this.f7951r = str;
        this.f7952s = str2;
        this.f7953t = str3;
        this.f7954u = str4;
        this.f7955v = f;
        this.f7956w = str5;
        this.f7957x = l7;
        this.f7958y = l8;
        this.f7959z = l9;
        this.f7947A = l10;
        this.f7948B = num;
        this.f7949C = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContinueWatch) {
            ContinueWatch continueWatch = (ContinueWatch) obj;
            return this.f7950q == continueWatch.f7950q && g.a(this.f7951r, continueWatch.f7951r) && g.a(this.f7952s, continueWatch.f7952s) && g.a(this.f7953t, continueWatch.f7953t) && g.a(this.f7954u, continueWatch.f7954u) && Float.compare(this.f7955v, continueWatch.f7955v) == 0 && g.a(this.f7956w, continueWatch.f7956w) && g.a(this.f7957x, continueWatch.f7957x) && g.a(this.f7958y, continueWatch.f7958y) && g.a(this.f7959z, continueWatch.f7959z) && g.a(this.f7947A, continueWatch.f7947A) && g.a(this.f7948B, continueWatch.f7948B) && this.f7949C == continueWatch.f7949C;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        long j7 = this.f7950q;
        int i7 = AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f7951r);
        int i8 = 0;
        String str = this.f7952s;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7953t;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f7954u;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int floatToIntBits = (Float.floatToIntBits(this.f7955v) + ((i10 + hashCode3) * 31)) * 31;
        String str4 = this.f7956w;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i11 = (floatToIntBits + hashCode4) * 31;
        Long l7 = this.f7957x;
        if (l7 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l7.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        Long l8 = this.f7958y;
        if (l8 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l8.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        Long l9 = this.f7959z;
        if (l9 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l9.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        Long l10 = this.f7947A;
        if (l10 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l10.hashCode();
        }
        int i15 = (i14 + hashCode8) * 31;
        Integer num = this.f7948B;
        if (num != null) {
            i8 = num.hashCode();
        }
        long j8 = this.f7949C;
        return ((i15 + i8) * 31) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContinueWatch(movieId=");
        sb.append(this.f7950q);
        sb.append(", movieName=");
        sb.append(this.f7951r);
        sb.append(", overview=");
        sb.append(this.f7952s);
        sb.append(", backdropPath=");
        sb.append(this.f7953t);
        sb.append(", releaseDate=");
        sb.append(this.f7954u);
        sb.append(", rating=");
        sb.append(this.f7955v);
        sb.append(", posterPath=");
        sb.append(this.f7956w);
        sb.append(", episodeId=");
        sb.append(this.f7957x);
        sb.append(", seasonNumber=");
        sb.append(this.f7958y);
        sb.append(", episodeNumber=");
        sb.append(this.f7959z);
        sb.append(", time=");
        sb.append(this.f7947A);
        sb.append(", percent=");
        sb.append(this.f7948B);
        sb.append(", tmdbId=");
        return AbstractC1111a.s(sb, this.f7949C, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f7950q);
        parcel.writeString(this.f7951r);
        parcel.writeString(this.f7952s);
        parcel.writeString(this.f7953t);
        parcel.writeString(this.f7954u);
        parcel.writeFloat(this.f7955v);
        parcel.writeString(this.f7956w);
        Long l7 = this.f7957x;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l7.longValue());
        }
        Long l8 = this.f7958y;
        if (l8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l8.longValue());
        }
        Long l9 = this.f7959z;
        if (l9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l9.longValue());
        }
        Long l10 = this.f7947A;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        Integer num = this.f7948B;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeLong(this.f7949C);
    }
}
