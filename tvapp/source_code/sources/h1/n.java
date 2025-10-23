package h1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.type.MediaType;
import java.io.Serializable;
import n0.w;
/* loaded from: classes.dex */
public final class n implements w {

    /* renamed from: a  reason: collision with root package name */
    public final String f10963a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaType f10964b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10965c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10966e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10967g;

    /* renamed from: h  reason: collision with root package name */
    public final String f10968h;

    /* renamed from: i  reason: collision with root package name */
    public final String f10969i;

    /* renamed from: j  reason: collision with root package name */
    public final float f10970j;

    /* renamed from: k  reason: collision with root package name */
    public final String f10971k;

    public n(String str, MediaType mediaType, long j7, long j8, long j9, long j10, long j11, String str2, String str3, float f, String str4) {
        this.f10963a = str;
        this.f10964b = mediaType;
        this.f10965c = j7;
        this.d = j8;
        this.f10966e = j9;
        this.f = j10;
        this.f10967g = j11;
        this.f10968h = str2;
        this.f10969i = str3;
        this.f10970j = f;
        this.f10971k = str4;
    }

    @Override // n0.w
    public final int a() {
        return R.id.goToPlayerLoading;
    }

    @Override // n0.w
    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("movieId", this.f10965c);
        bundle.putString("movieName", this.f10963a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(MediaType.class);
        MediaType mediaType = this.f10964b;
        if (isAssignableFrom) {
            M5.g.d(mediaType, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("movieType", mediaType);
        } else if (Serializable.class.isAssignableFrom(MediaType.class)) {
            M5.g.d(mediaType, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("movieType", mediaType);
        } else {
            throw new UnsupportedOperationException(MediaType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putLong("episodeId", this.d);
        bundle.putLong("seasonNumber", this.f10966e);
        bundle.putLong("episodeNumber", this.f);
        bundle.putLong("time", this.f10967g);
        bundle.putString("posterPath", this.f10968h);
        bundle.putString("overview", this.f10969i);
        bundle.putFloat("rating", this.f10970j);
        bundle.putString("releaseDate", this.f10971k);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (M5.g.a(this.f10963a, nVar.f10963a) && this.f10964b == nVar.f10964b && this.f10965c == nVar.f10965c && this.d == nVar.d && this.f10966e == nVar.f10966e && this.f == nVar.f && this.f10967g == nVar.f10967g && M5.g.a(this.f10968h, nVar.f10968h) && M5.g.a(this.f10969i, nVar.f10969i) && Float.compare(this.f10970j, nVar.f10970j) == 0 && M5.g.a(this.f10971k, nVar.f10971k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f10964b.hashCode();
        long j7 = this.f10965c;
        long j8 = this.d;
        long j9 = this.f10966e;
        long j10 = this.f;
        long j11 = this.f10967g;
        int hashCode4 = (((((((((((hashCode3 + (this.f10963a.hashCode() * 31)) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        int i7 = 0;
        String str = this.f10968h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10969i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int floatToIntBits = (Float.floatToIntBits(this.f10970j) + ((i8 + hashCode2) * 31)) * 31;
        String str3 = this.f10971k;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        return floatToIntBits + i7;
    }

    public final String toString() {
        return "GoToPlayerLoading(movieName=" + this.f10963a + ", movieType=" + this.f10964b + ", movieId=" + this.f10965c + ", episodeId=" + this.d + ", seasonNumber=" + this.f10966e + ", episodeNumber=" + this.f + ", time=" + this.f10967g + ", posterPath=" + this.f10968h + ", overview=" + this.f10969i + ", rating=" + this.f10970j + ", releaseDate=" + this.f10971k + ")";
    }
}
