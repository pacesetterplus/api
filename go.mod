module github.com/TheThingsNetwork/api

replace github.com/brocaar/lorawan => github.com/ThethingsIndustries/legacy-lorawan-lib v0.0.0-20190212122748-b905ab327304

require (
	github.com/TheThingsNetwork/go-utils v0.0.0-20190212114733-b66819ba738f
	github.com/TheThingsNetwork/ttn/api v0.0.0-20190212115741-672fb96aebea
	github.com/TheThingsNetwork/ttn/core/types v0.0.0-20190212115741-672fb96aebea
	github.com/TheThingsNetwork/ttn/utils/errors v0.0.0-20190212114225-bc403969e4a8
	github.com/TheThingsNetwork/ttn/utils/random v0.0.0-20190212115741-672fb96aebea
	github.com/TheThingsNetwork/ttn/utils/security v0.0.0-20190212115741-672fb96aebea
	github.com/bluele/gcache v0.0.0-20190203144525-2016d595ccb0
	github.com/brocaar/lorawan v0.0.0-20190212105515-c959d8761834
	github.com/gogo/protobuf v1.2.0
	github.com/golang/mock v1.1.1
	github.com/golang/protobuf v1.2.0
	github.com/grpc-ecosystem/grpc-gateway v1.7.0
	github.com/htdvisser/grpc-testing v0.0.0-20170303125020-f0a186b6b52b
	github.com/jacobsa/oglematchers v0.0.0-20150720000706-141901ea67cd // indirect
	github.com/jacobsa/oglemock v0.0.0-20150831005832-e94d794d06ff // indirect
	github.com/jacobsa/ogletest v0.0.0-20170503003838-80d50a735a11 // indirect
	github.com/jacobsa/reqtrace v0.0.0-20150505043853-245c9e0234cb // indirect
	github.com/mwitkow/go-grpc-middleware v1.0.0
	github.com/smartystreets/assertions v0.0.0-20190116191733-b6c0e53d7304
	golang.org/x/net v0.0.0-20190206173232-65e2d4e15006
	google.golang.org/genproto v0.0.0-20181016170114-94acd270e44e
	google.golang.org/grpc v1.18.0
)
