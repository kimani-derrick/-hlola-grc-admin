package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.boxhdo.domain.type.SourceType;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class StreamUrl implements Parcelable {
    public static final Parcelable.Creator<StreamUrl> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final String f8070q;

    /* renamed from: r  reason: collision with root package name */
    public final SourceType f8071r;

    /* renamed from: s  reason: collision with root package name */
    public final long f8072s;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StreamUrl> {
        @Override // android.os.Parcelable.Creator
        public final StreamUrl createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            return new StreamUrl(parcel.readString(), SourceType.valueOf(parcel.readString()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final StreamUrl[] newArray(int i7) {
            return new StreamUrl[i7];
        }
    }

    public StreamUrl() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreamUrl) {
            StreamUrl streamUrl = (StreamUrl) obj;
            return g.a(this.f8070q, streamUrl.f8070q) && this.f8071r == streamUrl.f8071r && this.f8072s == streamUrl.f8072s;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f8071r.hashCode();
        long j7 = this.f8072s;
        return ((hashCode + (this.f8070q.hashCode() * 31)) * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamUrl(url=");
        sb.append(this.f8070q);
        sb.append(", sourceType=");
        sb.append(this.f8071r);
        sb.append(", fileSize=");
        return AbstractC1111a.s(sb, this.f8072s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeString(this.f8070q);
        parcel.writeString(this.f8071r.name());
        parcel.writeLong(this.f8072s);
    }

    public /* synthetic */ StreamUrl(int i7) {
        this("", SourceType.f8110q, 0L);
    }

    public StreamUrl(String str, SourceType sourceType, long j7) {
        g.f(str, "url");
        g.f(sourceType, "sourceType");
        this.f8070q = str;
        this.f8071r = sourceType;
        this.f8072s = j7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StreamUrl(java.lang.String r6, java.lang.String r7, java.lang.Long r8) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            java.lang.String r6 = ""
        L4:
            com.boxhdo.domain.type.SourceType[] r0 = com.boxhdo.domain.type.SourceType.values()
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            java.lang.String r4 = r3.name()
            boolean r4 = U5.n.W(r4, r7)
            if (r4 == 0) goto L19
            goto L1d
        L19:
            int r2 = r2 + 1
            goto La
        L1c:
            r3 = 0
        L1d:
            if (r3 != 0) goto L21
            com.boxhdo.domain.type.SourceType r3 = com.boxhdo.domain.type.SourceType.f8110q
        L21:
            if (r8 == 0) goto L28
            long r7 = r8.longValue()
            goto L2a
        L28:
            r7 = 0
        L2a:
            r5.<init>(r6, r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.boxhdo.domain.model.StreamUrl.<init>(java.lang.String, java.lang.String, java.lang.Long):void");
    }
}
