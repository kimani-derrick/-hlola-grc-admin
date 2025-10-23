package A1;

import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class i extends M5.h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f36r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacksC0269x f37s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i7, ComponentCallbacksC0269x componentCallbacksC0269x) {
        super(0);
        this.f36r = i7;
        this.f37s = componentCallbacksC0269x;
    }

    @Override // L5.a
    public final Object b() {
        switch (this.f36r) {
            case 0:
                return this.f37s;
            case 1:
                return this.f37s;
            case 2:
                return this.f37s;
            case 3:
                return this.f37s;
            case 4:
                return this.f37s;
            case 5:
                ComponentCallbacksC0269x componentCallbacksC0269x = this.f37s;
                Bundle bundle = componentCallbacksC0269x.f6139v;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " has null arguments"));
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.f37s;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                b0 p3 = this.f37s.Z().p();
                M5.g.e(p3, "requireActivity().viewModelStore");
                return p3;
            case 8:
                return this.f37s.Z().a();
            case 9:
                Y r3 = this.f37s.Z().r();
                M5.g.e(r3, "requireActivity().defaultViewModelProviderFactory");
                return r3;
            case 10:
                b0 p5 = this.f37s.Z().p();
                M5.g.e(p5, "requireActivity().viewModelStore");
                return p5;
            case 11:
                return this.f37s.Z().a();
            case 12:
                Y r5 = this.f37s.Z().r();
                M5.g.e(r5, "requireActivity().defaultViewModelProviderFactory");
                return r5;
            case 13:
                b0 p7 = this.f37s.Z().p();
                M5.g.e(p7, "requireActivity().viewModelStore");
                return p7;
            case 14:
                return this.f37s.Z().a();
            case 15:
                Y r7 = this.f37s.Z().r();
                M5.g.e(r7, "requireActivity().defaultViewModelProviderFactory");
                return r7;
            case 16:
                ComponentCallbacksC0269x componentCallbacksC0269x2 = this.f37s;
                Bundle bundle2 = componentCallbacksC0269x2.f6139v;
                if (bundle2 != null) {
                    return bundle2;
                }
                throw new IllegalStateException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x2, " has null arguments"));
            case 17:
                return this.f37s;
            case 18:
                return this.f37s;
            case 19:
                return this.f37s;
            case 20:
                return this.f37s;
            case 21:
                ComponentCallbacksC0269x componentCallbacksC0269x3 = this.f37s;
                Bundle bundle3 = componentCallbacksC0269x3.f6139v;
                if (bundle3 != null) {
                    return bundle3;
                }
                throw new IllegalStateException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x3, " has null arguments"));
            case 22:
                return this.f37s;
            case 23:
                return this.f37s;
            case 24:
                return this.f37s;
            case 25:
                ComponentCallbacksC0269x componentCallbacksC0269x4 = this.f37s;
                Bundle bundle4 = componentCallbacksC0269x4.f6139v;
                if (bundle4 != null) {
                    return bundle4;
                }
                throw new IllegalStateException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x4, " has null arguments"));
            case 26:
                return this.f37s;
            case 27:
                ComponentCallbacksC0269x componentCallbacksC0269x5 = this.f37s;
                Bundle bundle5 = componentCallbacksC0269x5.f6139v;
                if (bundle5 != null) {
                    return bundle5;
                }
                throw new IllegalStateException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x5, " has null arguments"));
            default:
                return this.f37s;
        }
    }
}
