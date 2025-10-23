package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5313q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f5314r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f5315s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f5316t;

    public g(TextView textView, Typeface typeface, int i7) {
        this.f5313q = 2;
        this.f5316t = textView;
        this.f5315s = typeface;
        this.f5314r = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.b bVar;
        switch (this.f5313q) {
            case 0:
                Object obj = ((K3.f) this.f5316t).f1836a;
                h hVar = (h) this.f5315s;
                String str = (String) hVar.f5365a.get(Integer.valueOf(this.f5314r));
                if (str != null) {
                    androidx.activity.result.e eVar = (androidx.activity.result.e) hVar.f5368e.get(str);
                    if (eVar != null && (bVar = eVar.f5361a) != null) {
                        if (hVar.d.remove(str)) {
                            bVar.a(obj);
                            return;
                        }
                        return;
                    }
                    hVar.f5369g.remove(str);
                    hVar.f.put(str, obj);
                    return;
                }
                return;
            case 1:
                ((h) this.f5315s).a(this.f5314r, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f5316t));
                return;
            case 2:
                ((TextView) this.f5316t).setTypeface((Typeface) this.f5315s, this.f5314r);
                return;
            default:
                ((BottomSheetBehavior) this.f5315s).A((View) this.f5316t, this.f5314r);
                return;
        }
    }

    public /* synthetic */ g(h hVar, int i7, Object obj, int i8) {
        this.f5313q = i8;
        this.f5315s = hVar;
        this.f5314r = i7;
        this.f5316t = obj;
    }

    public g(BottomSheetBehavior bottomSheetBehavior, View view, int i7) {
        this.f5313q = 3;
        this.f5315s = bottomSheetBehavior;
        this.f5316t = view;
        this.f5314r = i7;
    }
}
