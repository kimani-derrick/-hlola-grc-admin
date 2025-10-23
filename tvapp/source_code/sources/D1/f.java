package D1;

import com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel;
import com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsFragment;
import com.boxhdo.android.tv.ui.subtitleSettings.SubtitleSettingsViewModel;
import com.boxhdo.domain.model.Subtitle;
import com.boxhdo.domain.model.SubtitleSource;
import o1.C;
import p1.C1083d;
import z5.C1530l;
/* loaded from: classes.dex */
public final /* synthetic */ class f extends M5.f implements L5.l {

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f488y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i7, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(i7, obj, cls, str, str2, i8);
        this.f488y = i9;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        switch (this.f488y) {
            case 0:
                Subtitle subtitle = (Subtitle) obj;
                M5.g.f(subtitle, "p0");
                SubtitleSettingsViewModel subtitleSettingsViewModel = (SubtitleSettingsViewModel) ((SubtitleSettingsFragment) this.f2298r).f7908u0.getValue();
                String str = subtitle.f8073a;
                M5.g.f(str, "lang");
                subtitleSettingsViewModel.d(false, new o(subtitleSettingsViewModel, str, null));
                return C1530l.f16479a;
            default:
                SubtitleSource subtitleSource = (SubtitleSource) obj;
                M5.g.f(subtitleSource, "p0");
                TvPlayerViewModel tvPlayerViewModel = (TvPlayerViewModel) ((C1083d) this.f2298r).f13119u0.getValue();
                tvPlayerViewModel.d(false, new C(tvPlayerViewModel, subtitleSource, null));
                return C1530l.f16479a;
        }
    }
}
