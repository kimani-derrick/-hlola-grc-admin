package v1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Movie;
import java.io.Serializable;
import n0.w;
/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Movie f15271a;

    public m(Movie movie) {
        this.f15271a = movie;
    }

    @Override // n0.w
    public final int a() {
        return R.id.goToEpisodeList;
    }

    @Override // n0.w
    public final Bundle b() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Movie.class);
        Movie movie = this.f15271a;
        if (isAssignableFrom) {
            M5.g.d(movie, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("movie", movie);
        } else if (Serializable.class.isAssignableFrom(Movie.class)) {
            M5.g.d(movie, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("movie", (Serializable) movie);
        } else {
            throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && M5.g.a(this.f15271a, ((m) obj).f15271a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15271a.hashCode();
    }

    public final String toString() {
        return "GoToEpisodeList(movie=" + this.f15271a + ")";
    }
}
