// tag::final-settings[]
// tag::after-init[]
rootProject.name = "creating-multi-project-builds"
// end::after-init[]
// tag::greeting-library[]
include("greeting-library")
// end::greeting-library[]
// tag::application[]
include("greeter")
// end::application[]
// tag::documentation[]
include("docs")
// end::documentation[]
// end::final-settings{}
