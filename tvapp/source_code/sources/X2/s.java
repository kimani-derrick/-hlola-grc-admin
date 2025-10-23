package X2;

import android.view.View;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import w0.k0;
/* loaded from: classes.dex */
public final class s extends k0 {

    /* renamed from: u  reason: collision with root package name */
    public final TextView f4197u;

    /* renamed from: v  reason: collision with root package name */
    public final View f4198v;

    public s(View view) {
        super(view);
        if (Z2.H.f4603a < 26) {
            view.setFocusable(true);
        }
        this.f4197u = (TextView) view.findViewById(R.id.exo_text);
        this.f4198v = view.findViewById(R.id.exo_check);
    }
}
