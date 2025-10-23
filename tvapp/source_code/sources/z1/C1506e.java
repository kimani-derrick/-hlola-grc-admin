package z1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.Movie;
import java.io.Serializable;
import n0.w;
import r0.AbstractC1111a;
/* renamed from: z1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506e implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Movie f16415a;

    /* renamed from: b  reason: collision with root package name */
    public final EpisodeSource f16416b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16417c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16418e;

    public C1506e(Movie movie, EpisodeSource episodeSource, long j7, long j8, long j9) {
        this.f16415a = movie;
        this.f16416b = episodeSource;
        this.f16417c = j7;
        this.d = j8;
        this.f16418e = j9;
    }

    @Override // n0.w
    public final int a() {
        return R.id.goToPlayer;
    }

    @Override // n0.w
    public final Bundle b() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Movie.class);
        Movie movie = this.f16415a;
        if (isAssignableFrom) {
            M5.g.d(movie, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("movie", movie);
        } else if (Serializable.class.isAssignableFrom(Movie.class)) {
            M5.g.d(movie, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("movie", (Serializable) movie);
        } else {
            throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(EpisodeSource.class);
        EpisodeSource episodeSource = this.f16416b;
        if (isAssignableFrom2) {
            bundle.putParcelable("episodeSource", episodeSource);
        } else if (Serializable.class.isAssignableFrom(EpisodeSource.class)) {
            bundle.putSerializable("episodeSource", (Serializable) episodeSource);
        } else {
            throw new UnsupportedOperationException(EpisodeSource.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putLong("seasonNumber", this.f16417c);
        bundle.putLong("episodeNumber", this.d);
        bundle.putLong("time", this.f16418e);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1506e)) {
            return false;
        }
        C1506e c1506e = (C1506e) obj;
        if (M5.g.a(this.f16415a, c1506e.f16415a) && M5.g.a(this.f16416b, c1506e.f16416b) && this.f16417c == c1506e.f16417c && this.d == c1506e.d && this.f16418e == c1506e.f16418e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f16415a.hashCode() * 31;
        EpisodeSource episodeSource = this.f16416b;
        if (episodeSource == null) {
            hashCode = 0;
        } else {
            hashCode = episodeSource.hashCode();
        }
        long j7 = this.f16417c;
        long j8 = this.d;
        long j9 = this.f16418e;
        return ((((((hashCode2 + hashCode) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoToPlayer(movie=");
        sb.append(this.f16415a);
        sb.append(", episodeSource=");
        sb.append(this.f16416b);
        sb.append(", seasonNumber=");
        sb.append(this.f16417c);
        sb.append(", episodeNumber=");
        sb.append(this.d);
        sb.append(", time=");
        return AbstractC1111a.s(sb, this.f16418e, ")");
    }
}
