package o1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.Movie;
import java.io.Serializable;
import n0.InterfaceC1016g;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class v implements InterfaceC1016g {

    /* renamed from: a  reason: collision with root package name */
    public final Movie f12880a;

    /* renamed from: b  reason: collision with root package name */
    public final EpisodeSource f12881b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12882c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12883e;

    public v(Movie movie, EpisodeSource episodeSource, long j7, long j8, long j9) {
        this.f12880a = movie;
        this.f12881b = episodeSource;
        this.f12882c = j7;
        this.d = j8;
        this.f12883e = j9;
    }

    public static final v fromBundle(Bundle bundle) {
        long j7;
        long j8;
        long j9;
        M5.g.f(bundle, "bundle");
        bundle.setClassLoader(v.class.getClassLoader());
        if (bundle.containsKey("movie")) {
            if (!Parcelable.class.isAssignableFrom(Movie.class) && !Serializable.class.isAssignableFrom(Movie.class)) {
                throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Movie movie = (Movie) bundle.get("movie");
            if (movie != null) {
                if (bundle.containsKey("episodeSource")) {
                    if (!Parcelable.class.isAssignableFrom(EpisodeSource.class) && !Serializable.class.isAssignableFrom(EpisodeSource.class)) {
                        throw new UnsupportedOperationException(EpisodeSource.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    EpisodeSource episodeSource = (EpisodeSource) bundle.get("episodeSource");
                    if (bundle.containsKey("seasonNumber")) {
                        j7 = bundle.getLong("seasonNumber");
                    } else {
                        j7 = 1;
                    }
                    if (bundle.containsKey("episodeNumber")) {
                        j8 = bundle.getLong("episodeNumber");
                    } else {
                        j8 = 1;
                    }
                    if (bundle.containsKey("time")) {
                        j9 = bundle.getLong("time");
                    } else {
                        j9 = 0;
                    }
                    return new v(movie, episodeSource, j7, j8, j9);
                }
                throw new IllegalArgumentException("Required argument \"episodeSource\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (M5.g.a(this.f12880a, vVar.f12880a) && M5.g.a(this.f12881b, vVar.f12881b) && this.f12882c == vVar.f12882c && this.d == vVar.d && this.f12883e == vVar.f12883e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f12880a.hashCode() * 31;
        EpisodeSource episodeSource = this.f12881b;
        if (episodeSource == null) {
            hashCode = 0;
        } else {
            hashCode = episodeSource.hashCode();
        }
        long j7 = this.f12882c;
        long j8 = this.d;
        long j9 = this.f12883e;
        return ((((((hashCode2 + hashCode) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvPlayerActivityArgs(movie=");
        sb.append(this.f12880a);
        sb.append(", episodeSource=");
        sb.append(this.f12881b);
        sb.append(", seasonNumber=");
        sb.append(this.f12882c);
        sb.append(", episodeNumber=");
        sb.append(this.d);
        sb.append(", time=");
        return AbstractC1111a.s(sb, this.f12883e, ")");
    }
}
