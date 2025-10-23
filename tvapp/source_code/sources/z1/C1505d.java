package z1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.domain.type.MediaType;
import java.io.Serializable;
import n0.InterfaceC1016g;
/* renamed from: z1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505d implements InterfaceC1016g {

    /* renamed from: a  reason: collision with root package name */
    public final String f16406a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaType f16407b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16408c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16409e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16410g;

    /* renamed from: h  reason: collision with root package name */
    public final String f16411h;

    /* renamed from: i  reason: collision with root package name */
    public final String f16412i;

    /* renamed from: j  reason: collision with root package name */
    public final float f16413j;

    /* renamed from: k  reason: collision with root package name */
    public final String f16414k;

    public C1505d(String str, MediaType mediaType, long j7, long j8, long j9, long j10, long j11, String str2, String str3, float f, String str4) {
        this.f16406a = str;
        this.f16407b = mediaType;
        this.f16408c = j7;
        this.d = j8;
        this.f16409e = j9;
        this.f = j10;
        this.f16410g = j11;
        this.f16411h = str2;
        this.f16412i = str3;
        this.f16413j = f;
        this.f16414k = str4;
    }

    public static final C1505d fromBundle(Bundle bundle) {
        long j7;
        long j8;
        long j9;
        String str;
        String str2;
        float f;
        String str3;
        M5.g.f(bundle, "bundle");
        bundle.setClassLoader(C1505d.class.getClassLoader());
        long j10 = 0;
        if (bundle.containsKey("movieId")) {
            j7 = bundle.getLong("movieId");
        } else {
            j7 = 0;
        }
        if (bundle.containsKey("movieName")) {
            String string = bundle.getString("movieName");
            if (string != null) {
                if (bundle.containsKey("movieType")) {
                    if (!Parcelable.class.isAssignableFrom(MediaType.class) && !Serializable.class.isAssignableFrom(MediaType.class)) {
                        throw new UnsupportedOperationException(MediaType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    MediaType mediaType = (MediaType) bundle.get("movieType");
                    if (mediaType != null) {
                        if (bundle.containsKey("episodeId")) {
                            j8 = bundle.getLong("episodeId");
                        } else {
                            j8 = 0;
                        }
                        long j11 = 1;
                        if (bundle.containsKey("seasonNumber")) {
                            j9 = bundle.getLong("seasonNumber");
                        } else {
                            j9 = 1;
                        }
                        if (bundle.containsKey("episodeNumber")) {
                            j11 = bundle.getLong("episodeNumber");
                        }
                        long j12 = j11;
                        if (bundle.containsKey("time")) {
                            j10 = bundle.getLong("time");
                        }
                        long j13 = j10;
                        if (bundle.containsKey("posterPath")) {
                            str = bundle.getString("posterPath");
                        } else {
                            str = null;
                        }
                        if (bundle.containsKey("overview")) {
                            str2 = bundle.getString("overview");
                        } else {
                            str2 = null;
                        }
                        if (bundle.containsKey("rating")) {
                            f = bundle.getFloat("rating");
                        } else {
                            f = 0.0f;
                        }
                        float f7 = f;
                        if (bundle.containsKey("releaseDate")) {
                            str3 = bundle.getString("releaseDate");
                        } else {
                            str3 = null;
                        }
                        return new C1505d(string, mediaType, j7, j8, j9, j12, j13, str, str2, f7, str3);
                    }
                    throw new IllegalArgumentException("Argument \"movieType\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"movieType\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"movieName\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"movieName\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1505d)) {
            return false;
        }
        C1505d c1505d = (C1505d) obj;
        if (M5.g.a(this.f16406a, c1505d.f16406a) && this.f16407b == c1505d.f16407b && this.f16408c == c1505d.f16408c && this.d == c1505d.d && this.f16409e == c1505d.f16409e && this.f == c1505d.f && this.f16410g == c1505d.f16410g && M5.g.a(this.f16411h, c1505d.f16411h) && M5.g.a(this.f16412i, c1505d.f16412i) && Float.compare(this.f16413j, c1505d.f16413j) == 0 && M5.g.a(this.f16414k, c1505d.f16414k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f16407b.hashCode();
        long j7 = this.f16408c;
        long j8 = this.d;
        long j9 = this.f16409e;
        long j10 = this.f;
        long j11 = this.f16410g;
        int hashCode4 = (((((((((((hashCode3 + (this.f16406a.hashCode() * 31)) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        int i7 = 0;
        String str = this.f16411h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode4 + hashCode) * 31;
        String str2 = this.f16412i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int floatToIntBits = (Float.floatToIntBits(this.f16413j) + ((i8 + hashCode2) * 31)) * 31;
        String str3 = this.f16414k;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        return floatToIntBits + i7;
    }

    public final String toString() {
        return "PlayerLoadingFragmentArgs(movieName=" + this.f16406a + ", movieType=" + this.f16407b + ", movieId=" + this.f16408c + ", episodeId=" + this.d + ", seasonNumber=" + this.f16409e + ", episodeNumber=" + this.f + ", time=" + this.f16410g + ", posterPath=" + this.f16411h + ", overview=" + this.f16412i + ", rating=" + this.f16413j + ", releaseDate=" + this.f16414k + ")";
    }
}
