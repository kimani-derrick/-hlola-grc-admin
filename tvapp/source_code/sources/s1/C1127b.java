package s1;

import com.boxhdo.android.tv.ui.home.TvHomeFragment;
import com.boxhdo.domain.model.HomeRow;
import com.boxhdo.domain.model.Movie;
import z5.C1530l;
/* renamed from: s1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127b implements Z5.c {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ TvHomeFragment f13547q;

    public C1127b(TvHomeFragment tvHomeFragment) {
        this.f13547q = tvHomeFragment;
    }

    @Override // Z5.c
    public final Object a(Object obj, D5.d dVar) {
        Movie movie = ((HomeRow.SliderRow) obj).f8004a;
        if (movie.f8029q > 0) {
            this.f13547q.N0(movie);
        }
        return C1530l.f16479a;
    }
}
