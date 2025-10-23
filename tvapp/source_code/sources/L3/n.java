package L3;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
/* loaded from: classes.dex */
public final class n implements View.OnTouchListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f2081q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ q f2082r;

    public n(q qVar, AutoCompleteTextView autoCompleteTextView) {
        this.f2082r = qVar;
        this.f2081q = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            q qVar = this.f2082r;
            qVar.getClass();
            long currentTimeMillis = System.currentTimeMillis() - qVar.f2091k;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                qVar.f2089i = false;
            }
            q.d(qVar, this.f2081q);
        }
        return false;
    }
}
