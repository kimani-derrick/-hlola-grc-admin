package t1;

import M5.h;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.hostMain.TvMainFragment;
/* renamed from: t1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226b extends h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f14523r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ TvMainFragment f14524s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1226b(TvMainFragment tvMainFragment, int i7) {
        super(0);
        this.f14523r = i7;
        this.f14524s = tvMainFragment;
    }

    @Override // L5.a
    public final Object b() {
        switch (this.f14523r) {
            case 0:
                return Integer.valueOf(this.f14524s.u().getDimensionPixelSize(R.dimen.dp_150));
            case 1:
                return Integer.valueOf(this.f14524s.u().getDimensionPixelSize(R.dimen.dp_75));
            default:
                return new C1227c(this.f14524s);
        }
    }
}
