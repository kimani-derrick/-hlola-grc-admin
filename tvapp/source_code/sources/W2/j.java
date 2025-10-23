package W2;

import O3.T;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
/* loaded from: classes.dex */
public final class j implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f3837a;

    public j(o oVar) {
        this.f3837a = oVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z7) {
        o oVar = this.f3837a;
        T t5 = o.f3864j;
        oVar.h();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z7) {
        o oVar = this.f3837a;
        T t5 = o.f3864j;
        oVar.h();
    }
}
