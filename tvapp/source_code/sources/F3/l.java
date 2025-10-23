package F3;

import K.B;
import K.O;
import android.view.View;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class l implements View.OnAttachStateChangeListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f725q;

    public /* synthetic */ l(int i7) {
        this.f725q = i7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        androidx.databinding.d dVar;
        switch (this.f725q) {
            case 0:
                view.removeOnAttachStateChangeListener(this);
                Field field = O.f1447a;
                B.c(view);
                return;
            default:
                if (view != null) {
                    dVar = (androidx.databinding.d) view.getTag(R.id.dataBinding);
                } else {
                    dVar = null;
                }
                dVar.d.run();
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i7 = this.f725q;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
