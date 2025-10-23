package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {

    /* renamed from: I  reason: collision with root package name */
    public final float f6545I;

    /* renamed from: J  reason: collision with root package name */
    public t0 f6546J;

    /* renamed from: K  reason: collision with root package name */
    public t0 f6547K;

    /* renamed from: L  reason: collision with root package name */
    public int f6548L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f6549M;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6548L = 0;
        this.f6549M = false;
        Resources resources = context.getResources();
        this.f6545I = resources.getFraction(R.fraction.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.f6547K = new t0(resources.getColor(R.color.lb_speech_orb_not_recording), resources.getColor(R.color.lb_speech_orb_not_recording_pulsed), resources.getColor(R.color.lb_speech_orb_not_recording_icon));
        this.f6546J = new t0(resources.getColor(R.color.lb_speech_orb_recording), resources.getColor(R.color.lb_speech_orb_recording), 0);
        c();
    }

    public final void c() {
        setOrbColors(this.f6547K);
        setOrbIcon(getResources().getDrawable(R.drawable.lb_ic_search_mic_out));
        a(hasFocus());
        View view = this.f6523s;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.f6549M = false;
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return R.layout.lb_speech_orb;
    }

    public void setListeningOrbColors(t0 t0Var) {
        this.f6546J = t0Var;
    }

    public void setNotListeningOrbColors(t0 t0Var) {
        this.f6547K = t0Var;
    }

    public void setSoundLevel(int i7) {
        int i8;
        if (!this.f6549M) {
            return;
        }
        int i9 = this.f6548L;
        if (i7 > i9) {
            i8 = ((i7 - i9) / 2) + i9;
        } else {
            i8 = (int) (i9 * 0.7f);
        }
        this.f6548L = i8;
        float focusedZoom = (((this.f6545I - getFocusedZoom()) * this.f6548L) / 100.0f) + 1.0f;
        View view = this.f6523s;
        view.setScaleX(focusedZoom);
        view.setScaleY(focusedZoom);
    }
}
