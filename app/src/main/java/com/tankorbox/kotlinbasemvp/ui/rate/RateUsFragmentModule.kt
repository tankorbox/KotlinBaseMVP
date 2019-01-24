import dagger.Module
import dagger.Provides

@Module
class RateUsFragmentModule {

    @Provides
    internal fun provideRateUsInteractor(interactor: RateUsInteractor): RateUsMVPInterator = interactor

    @Provides
    internal fun provideRateUsPresenter(presenter: RateUsPresenter<RateUsDialogMVPView, RateUsMVPInterator>)
            : RateUsMVPPresenter<RateUsDialogMVPView, RateUsMVPInterator> = presenter
}