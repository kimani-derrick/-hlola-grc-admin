package X2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import w0.k0;
/* loaded from: classes.dex */
public final class q extends k0 {

    /* renamed from: u  reason: collision with root package name */
    public final TextView f4191u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f4192v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f4193w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w f4194x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, View view) {
        super(view);
        this.f4194x = wVar;
        if (Z2.H.f4603a < 26) {
            view.setFocusable(true);
        }
        this.f4191u = (TextView) view.findViewById(R.id.exo_main_text);
        this.f4192v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f4193w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new C1.b(3, this));
    }
}
